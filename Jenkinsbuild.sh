#!/bin/bash
#获取当前分支名
echo "当前分支名："$(git symbolic-ref --short -q HEAD)
#shell赋值不允许有空格，mmp
branch=$(git symbolic-ref --short -q HEAD)
para1=$1
Version_log=
host='http://10.160.11.88:8080'
#宝腾分支代码
job_name='protonLink_operation'
ecarx_trigger='ecarx_trigger'
#$# 返回值是参数的个数
#$0 是命令本身的名称
#$1 是第一个参数
#$2 是第二个参数

Version_log(){
	echo "Function begin..."

    #判断当前分支是否是master，
    echo "$branch"
    #不能直接引用-eq
    if [[ "$branch" = "master" ]]; then
		echo "branch is master"
	    #gnetlink对应job
        Version_log=1.6.0
	else
	    echo "命名当前分支log："$branch
	   Version_log=$branch
	fi
	echo "Function end!"
}

JenkinsBuild(){
	echo "Function begin..."
    #取出第一个参数作为token,判断必传参数
    if [ ! $para1 ]; then
		echo "para1 is null"
		echo "$branch"
		echo "$job_name"
	    #gnetlink对应job
        curl "$host/job/$ecarx_trigger//buildWithParameters?token=$ecarx_trigger&build_job=$job_name&git_branch=$branch&Version_log=$Version_log"
	else
	    echo "获取当前第一个参数："$para1
	    curl "$host/job/$ecarx_trigger//buildWithParameters?token=$ecarx_trigger&build_job=$job_name&git_branch=$para1&Version_log=$Version_log"

	fi
	echo "当前日值版本"$Version_log
	echo "Function end!"
}


#获取参数总数
#getParamSum(){
#count=1
#while [  "$#" -ge  "1" ];#注意空格
#do
  #   echo "Parameter number $count  is: $1"
   # let count=$count+1
   #  shift
#	done
#}
#判断当前版本
Version_log
# 执行jenkins进行build方法
JenkinsBuild



