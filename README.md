# Project_MyU_App
---
Android Studio version
Android Studio Giraffe | 2022.3.1 Patch 2
Runtime version: 17.0.6+0-b2043.56-10027231 amd64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
Windows 11 10.0





git 사용법

Git 기본 명령어
git status : 현재 상태 확인
git log : 전체 로그 확인 
git init : git 저장소 생성하기 
git clone [https: ~~~~ ] : 저장소 복제 및 다운로드 
git add [파일명] or * : 저장소에 코드 추가
git add -A : 커밋에 파일의 변경 사항을 한번에 모두 포함 
git commit -m "message" : 커밋 생성
git push origin master : 변경 사항 원격 서버 업로드 (push)
git pull : 원격 저장소의 변경 내용을 현재 디렉토리로 가져오기 (pull)
git diff [브랜치 이름] [다른 브랜치 이름] : 변경 내용을 merge 하기 전에 바뀐 내용 비교

Git Branch 관련
git init : git init을 설정하면 해당 폴더에 .git 이라는 파일이 생성됨
git remote add origin [github 주소] : github 주소와 연결 
git branch [브랜치명] : 브랜치 생성
git checkout [브랜치명] : 해당 브랜치로 이동
git branch -b [브랜치명] : 브랜치를 생성하고 해당 브랜치로 바로 이동
git branch : 원하는 브랜치로 이동했는지 확인 
git brach -a : 모든 브랜치 확인 
git add . : 파일 및 폴더 add
git commit -m "commit message" : 커밋 
git push origin [브랜치명] : 원하는 브랜치로 push하여 원격 서버에 전송 
git branch -d [브랜치 이름] : 브랜치 삭제 
git merge [다른 브랜치 이름] : 현재 브랜치에 다른 브랜치 수정사항 병합

Git config 설정 관련
git config --list : 전체 config 리스트 확인 
git config --global user.name "홍길동"
git config --global user.email "name@naver.com" : git config 설정하는 방법
git config --unset user.name
git config --unset user.email : git config 삭제하기 
git config --unset --global user.name
git config --unset --global user.email : 삭제해도 계속 남아있는 경우 global 옵션을 주어 설정했을 것임, global로 설정된 사용자를 지울 경우 아래와 같이 global 추가
