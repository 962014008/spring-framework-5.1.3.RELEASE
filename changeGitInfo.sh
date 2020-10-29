#!/bin/sh，使用方式sh ./changeGitInfo.sh
git filter-branch --force --env-filter '
  if [ "$GIT_COMMITTER_NAME" = "xxx" ] || [ "$GIT_AUTHOR_EMAIL" = "xxx@xxx.com" ]
  then
    #替换提交的用户名为新的用户名，替换提交的邮箱为正确的邮箱
    GIT_COMMITTER_NAME="962014008"
    GIT_COMMITTER_EMAIL="962014008@qq.com"
    
    GIT_AUTHOR_NAME="962014008"
    GIT_AUTHOR_EMAIL="962014008@qq.com"
  fi
' --tag-name-filter cat -- --all