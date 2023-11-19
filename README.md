<div align="center">

# :articulated_lorry: 스트릿 푸드 파이터

손님을 위한

길거리 음식 포장 주문 | 길거리 음식 펀딩 시스템 | 와주세요! 서비스

사장님을 위한

포장 주문 접수 | 지역별 통계 정보 제공 | :triangular_flag_on_post: 깃발을 활용한 수요 조사

<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/41c31137-64ac-4a4b-992b-0ff4e0c1514a" width="200px">
</div>

## 목차
1. [개요](##)
2. [팀원 소개](#)
3. [서비스 화면](##)
4. [개발 환경](#)
5. [설계 문서](#)
6. [기술 소개](#)


## 1. 개요
> <b>프로젝트 기간</b> : 202310/09 ~ 2023/11/17 <br>
> <b>참고자료 </b> : 🎞 [UCC](https://www.youtube.com/watch?v=F7RfIP8jiGM)
📃 [최종발표 PPT](url들어갈자리 google docs)
<br>

## 2. 팀원 소개
|   **Name**   | 황재영👑 |  곽보선  |  강동윤  | 구배성  |  김성인  |  박슬빈  |
| :----------: | :------: | :------: | :------: | :-----: | :------: | :------: |
| **Position** | BackEnd  | FrontEnd | BackEnd | BackEnd | BackEnd | BackEnd |

<br>

## 3. 서비스 화면
### 손님
| **내 근처 가게 조회** | **날짜별 펀딩 가능한 깃발 조회** | **주문하기** |
| :------: | :------: | :------: |
|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/071d4071-c51e-48a8-9176-84c8d6828a8a">|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/bc1e345d-d33d-4af0-b660-162ad14e7aec">|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/ed2c0892-dc4a-4e86-9fd9-84aaff455452">|

| **펀딩 성공시 주문하기** | **리뷰하기** | **주문 & 펀딩 & 리뷰 내역 조회** |
| :------: | :------: | :------: |
|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/f6ab0dad-bb89-4584-862a-614ec872c70a">|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/29dd930d-1ec6-492a-978d-ef1d61dbb30f">|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/a9ca4087-bc58-48dd-a855-e8ab5385267d">|

| **파이터 등급** | **원해요 선택** | **충전하기** |
| :------: | :------: | :------: |
|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/56d1641e-3681-46d6-b541-dba0aba6a063">|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/cf2f7c4c-a916-4644-bd75-f4c50e1af2a8">|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/8551b7d2-3ed6-46bf-90b7-09f47fdab327">|
<br>

### 사장님
| **영업 시작** | **상품 관리** | **카테고리 설정** |
| :------: | :------: | :------: |
|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/3a7bad80-e5d7-44aa-9a9a-3d60290e1781">|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/df6cdbd2-a558-4572-b6b4-8f35e44ce70c">|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/7c066bd0-86e5-44b7-be9d-061dbd071d97">|

| **펀딩 깃발 관리** | **주문 목록** | **지역별 원해요 통계 조회** |
| :------: | :------: | :------: |
|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/c53bdfce-1b53-4722-82cb-9930bfb09aba">|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/f9ccf715-9281-40ab-b166-943112b9b46a">|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/94d9b1b5-e51d-4023-9521-b61dd36de5f4">|

| **영업 종료** |
| :------: | 
|<img src="https://github.com/0214kbs/StreetFoodFighter/assets/87002218/890e9eeb-a871-4365-8316-8d83dc6c7fb8" width="308px">|
<br>

## 4. 개발 환경
### ⚙ Management Tool
- 형상 관리 : Gitlab
- 이슈 관리 : Jira
- 커뮤니케이션 : Mattermost, Notion, Discord
- 디자인 : Figma, PowerPoint

### 💻 IDE
- Visual Studio Code `1.83.0`
- IntelliJ `11.0.19`
- Android Studio

### 📱 Frontend
- nextjs: 13.4.8
- react: 18.2.0
- styled-components: 6.0.2
- typescript: 5.1.6
- zustand: 4.3.9
- firebase: 10.5.2
- axios: 1.4.0
- moment: 2.29.4
- chart.js: 4.4.0
- eslint: 8.2.0
- prettier: 3.0.0

### 💾 Backend
- Java : 17
- MySql : 8.1
- Kafka : 3.5.1
- SpringCloud : 2022.0.3
- Spring Boot : 3.1.5
- logstash-logback-encoder : 6.3

### Mobile
- Flutter
- inapp_webview

### Infra
- FCM
- AWS EC2
- Docker 24.0.6
- Ubuntu 20.04.6 LTS
- Elastic Stack : 8.11.0
<br>

## 5. 설계 문서

### ○ ERD
![스푸파](https://github.com/0214kbs/StreetFoodFighter/assets/87002218/8fcb6317-fe02-48f8-ad55-2b32a1fa6dce)

### ○ 시스템 아키텍처
![스푸파_아키텍쳐](https://github.com/0214kbs/StreetFoodFighter/assets/87002218/e1c96aac-bcaa-4250-ad95-c9a9fdfb699e)

<br>

## 6. 기술 소개
- MSA (Spring Cloud, Eureka)
    - 서비스별 독립적인 기능이 많아 서버를 분리
    - 회원 정보 관리 서비스와 가게 정보 조회 서비스에 요청이 타 서비스에 비해 많을 것으로 생각하여 서버를 분리
    - 한 서비스에 문제가 발생하여도 지속적인 서비스를 제공하기 위해 사용
- Kafka
    - 서버간의 느슨한 결합
    - 이벤트가 발생했음을 알리기 위해 사용
    - 메시지큐 방식을 통해 빠른 메시지 전송
- Open Feign
    - 서버간 통신을 위해 사용
    - Spring Cloud의 기술인 Eureka와의 편리한 통합을 위해 사용
- Elastic search + logtash + kibana
    - ELK 스택 구축해서 분산 서버에서 로깅을 하나의 서버로 통합
- 웹 기반 하이브리드 애플리케이션
    - Flutter를 활용하여 웹 및 모바일 앱 플랫폼 모두 사용 가능
<br>










