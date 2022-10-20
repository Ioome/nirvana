#  git 使用
<img src="https://cloud.az22c.top/add-commit-push.png-az22cgithub">

working directory为本地的工作区
stage area为暂存区，亦称作stage或者index
local branch代指某个本地分支
remote branch代指某个远程分支

##### 流程
```git
git add .              将 对本地工作区中所有的内容变动 保存到暂存区
git commit -m "描述"    将 暂存区的内容 提交到本地分支
git push               将 本地分支的变化 同步到远程分支
```
**暂存区**: 修改项目中的文件，都会被当做一种原子物体，里面是修改的文件，也就是一些图形化页面
当你修改文件之后会立马显示这就是暂存区的魅力<br />
**本地分支**:本地建立的分支，但是远程是并没有这个仓库的,也就是需要提交到远程仓库才行

##### 暂存区的延申

```java
git checkout file.name=discart file.name
```

```java
git diff 显示当前工作区的文件和暂存区文件的差异

git diff --staged 显示暂存区和HEAD的文件的差异

git diff HEAD 显示工作区和HEAD的文件的差异
```

查看当前分支
```
git branch -vv
```

删除分支
```java
git branch -d cate  
```

合并分支
```java
git checkout master
git merge cate
git push
```