# Street Food Fighter <Backend>

## 개발 환경

### 💻 IDE

- IntelliJ `11.0.19`
- Android Studio

### 💾 Backend

- Java : 17
- MySql : 8.1
- Kafka : 3.5.1
- SpringCloud : 2022.0.3
- Spring Boot : 3.1.5
- logstash-logback-encoder : 6.3

### Infra

- FCM
- AWS EC2
- Docker 24.0.6
- Ubuntu 20.04.6 LTS
- Elastic Stack : 8.11.0
  <br>

## 기술 소개

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
- 웹 기반 하이브리드 애플리케이션 - Flutter를 활용하여 웹 및 모바일 앱 플랫폼 모두 사용 가능
  <br>
