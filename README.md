# 🛍️ 크라우드 펀딩 E-commerce 프로젝트
크라우드 펀딩 E-commerce 플랫폼인 **텀블벅**의 핵심 요구 사항을 분석하여 만든 서비스입니다. 후원형 전자상거래의 구조적 특징(선주문, 수량제한, 쿠폰 등)을 반영하며, 대규모 트래픽 환경에서도 안정적인 서비스를 제공할 수 있도록 고도화된 구조로 개발되었습니다.  


### ✅ 개발 및 고도화 단계

1. **기획 및 MVP 개발**
   - 크라우드 펀딩의 도메인 특성을 반영한 기능 정의
   - 프로젝트 등록 / 주문 / 결제 / 검색 / 쿠폰 발급 / 알림 등 핵심 기능 구현

2. **단위 · 통합 테스트 및 1차 개선**
   - JUnit5 기반 단위 테스트와 통합 테스트 작성
   - 이미지 최적화 및 마크다운 이미지 처리 방식 개선
   - 쿠폰 발급 및 실시간 알림 동작 안정성 확보

3. **부하 테스트 및 2차 개선**
   - JMeter 및 Signoz 기반 부하 테스트 수행
   - 트래픽 집중 시 병목 구간 분석 및 개선 
   - Redis 적용, 비동기 처리 도입으로 확장성 개선

<br>   

## 🚀 주요 기능 및 개선 사항

🔨 **프로젝트 등록**  
> 이미지 업로드와 함께 프로젝트를 생성하고 상품 옵션까지 구성할 수 있습니다.
> <br> 🔗 [예시) 이미지 최적화](링크달기)

💳 **주문 및 결제**  
> 후원 방식으로 주문을 생성하고 결제를 완료합니다.
> <br> 🔗 [1. 동기 처리 방식 → 이벤트 기반 비동기 구조 개선](https://github.com/team-2percent/Athena_Backend/wiki/%5B%EC%84%B1%EB%8A%A5%EA%B0%9C%EC%84%A0%5D-%EC%A3%BC%EB%AC%B8,%EA%B2%B0%EC%A0%9C-%EC%8B%9C%EB%82%98%EB%A6%AC%EC%98%A4-%EA%B0%9C%EC%84%A0-%E2%80%90-1.-%EB%8F%99%EA%B8%B0-%EC%B2%98%EB%A6%AC-%EB%B0%A9%EC%8B%9D%E2%80%90---%EC%9D%B4%EB%B2%A4%ED%8A%B8-%EA%B8%B0%EB%B0%98-%EB%B9%84%EB%8F%99%EA%B8%B0-%EA%B5%AC%EC%A1%B0-%EA%B0%9C%EC%84%A0)
> <br>
> <br> 🛠️ [재고차감 데드락 문제 해결 ‐ 1 (Lock 기반)](https://github.com/team-2percent/Athena_Backend/wiki/%5B%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85-1%5D-%EA%B2%B0%EC%A0%9C-%EC%9E%AC%EA%B3%A0%EC%B0%A8%EA%B0%90-%EB%A1%9C%EC%A7%81-%E2%80%90-2.-%EB%8D%B0%EB%93%9C%EB%9D%BD-%EB%AC%B8%EC%A0%9C-%ED%95%B4%EA%B2%B0-%EA%B3%BC%EC%A0%95(lock-%EA%B8%B0%EB%B0%98))
> <br> 🛠️ [재고차감 데드락 문제 해결 ‐ 2](https://github.com/team-2percent/Athena_Backend/wiki/%5B%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85-2%5D-%EA%B2%B0%EC%A0%9C-%EC%9E%AC%EA%B3%A0%EC%B0%A8%EA%B0%90-%EB%A1%9C%EC%A7%81-%E2%80%90-2.-%EB%8D%B0%EB%93%9C%EB%9D%BD-%EB%AC%B8%EC%A0%9C-%ED%95%B4%EA%B2%B0-%EA%B3%BC%EC%A0%95)

🎟️ **선착순 쿠폰 발급**  
> 관리자가 지정한 수량과 조건에 따라, 사용자에게 자동으로 쿠폰이 발급됩니다.
> <br> 🔗 [1. Lock 기반 제어 도입](https://github.com/team-2percent/Athena_Backend/wiki/%5B%EC%84%B1%EB%8A%A5%EA%B0%9C%EC%84%A0%5D-%EC%BF%A0%ED%8F%B0-%EB%B0%9C%EA%B8%89-%EA%B0%9C%EC%84%A0-%E2%80%90-1.-Lock-%EA%B8%B0%EB%B0%98-%EC%A0%9C%EC%96%B4-%EB%8F%84%EC%9E%85)
> <br> 🔗 [2. Lock 제거를 통한 Redis 원자적 처리](https://github.com/team-2percent/Athena_Backend/wiki/%5B%EC%84%B1%EB%8A%A5%EA%B0%9C%EC%84%A0%5D-%EC%BF%A0%ED%8F%B0-%EB%B0%9C%EA%B8%89-%EA%B0%9C%EC%84%A0-%E2%80%90-2.-Lock-%EC%A0%9C%EA%B1%B0%EB%A5%BC-%ED%86%B5%ED%95%9C-Redis-%EC%9B%90%EC%9E%90%EC%A0%81-%EC%B2%98%EB%A6%AC)
> <br> 🔗 [3. 이벤트 기반 비동기 처리로 성능 개선](https://github.com/team-2percent/Athena_Backend/wiki/%5B%EC%84%B1%EB%8A%A5-%EA%B0%9C%EC%84%A0%5D-%EC%BF%A0%ED%8F%B0-%EB%B0%9C%EA%B8%89-%EA%B0%9C%EC%84%A0-%E2%80%90-3.-%EC%9D%B4%EB%B2%A4%ED%8A%B8-%EA%B8%B0%EB%B0%98-%EB%B9%84%EB%8F%99%EA%B8%B0-%EC%B2%98%EB%A6%AC%EB%A1%9C-%EC%84%B1%EB%8A%A5-%EA%B0%9C%EC%84%A0)
> <br> 🔗 [4. 이벤트 구조 개선 및 보상 트랜잭션 설계](https://github.com/team-2percent/Athena_Backend/wiki/%5B%EC%84%B1%EB%8A%A5-%EA%B0%9C%EC%84%A0%5D-%EC%BF%A0%ED%8F%B0-%EB%B0%9C%EA%B8%89-%EA%B0%9C%EC%84%A0-%E2%80%90-4.-%EC%9D%B4%EB%B2%A4%ED%8A%B8-%EA%B5%AC%EC%A1%B0-%EA%B0%9C%EC%84%A0-%EB%B0%8F-%EB%B3%B4%EC%83%81-%ED%8A%B8%EB%9E%9C%EC%9E%AD%EC%85%98-%EC%84%A4%EA%B3%84)
> <br> 
> <br> 📈 [성능 비교 그래프 및 쿠폰 발급 아키텍처 보기](https://github.com/team-2percent/Athena_Backend/wiki/%5B%EC%84%B1%EB%8A%A5-%EA%B0%9C%EC%84%A0%5D-%EC%BF%A0%ED%8F%B0-%EB%B0%9C%EA%B8%89-%EA%B0%9C%EC%84%A0-%E2%80%90-%EC%84%B1%EB%8A%A5-%EB%B9%84%EA%B5%90-%EB%B0%8F-%EC%BF%A0%ED%8F%B0-%EB%B0%9C%EA%B8%89-%EC%95%84%ED%82%A4%ED%85%8D%EC%B2%98)

📩 **알림 시스템**  
> 주문, 쿠폰 발급, 후기 등록 등 주요 이벤트 발생 시, 사용자에게 FCM 기반 실시간 알림을 전송합니다.
> <br> 🔗 [1. 이벤트 기반 구조 개선](https://github.com/team-2percent/Athena_Backend/wiki/%5B%EC%84%B1%EB%8A%A5-%EA%B0%9C%EC%84%A0%5D-%EC%95%8C%EB%A6%BC-%E2%80%90-1.-%EC%9D%B4%EB%B2%A4%ED%8A%B8-%EA%B8%B0%EB%B0%98-%EA%B5%AC%EC%A1%B0-%EA%B0%9C%EC%84%A0)
> <br> 🔗 [2. 동기 발송 부하 테스트와 FCM 429 한계](https://github.com/team-2percent/Athena_Backend/wiki/%5B%EC%84%B1%EB%8A%A5-%EA%B0%9C%EC%84%A0%5D-%EC%95%8C%EB%A6%BC-%E2%80%90-2.-%EB%8F%99%EA%B8%B0-%EB%B0%9C%EC%86%A1-%EB%B6%80%ED%95%98-%ED%85%8C%EC%8A%A4%ED%8A%B8%EC%99%80-FCM-429-%ED%95%9C%EA%B3%84)
> <br> 🔗 [3. sendAsync 기반 논블로킹 전환](https://github.com/team-2percent/Athena_Backend/wiki/%5B%EC%84%B1%EB%8A%A5-%EA%B0%9C%EC%84%A0%5D-%EC%95%8C%EB%A6%BC-%E2%80%90-3.-sendAsync-%EA%B8%B0%EB%B0%98-%EB%85%BC%EB%B8%94%EB%A1%9C%ED%82%B9-%EC%A0%84%ED%99%98)
> <br> 🔗 [4. @Async 도입과 스레드 풀 병목 분석](https://github.com/team-2percent/Athena_Backend/wiki/%5B%EC%84%B1%EB%8A%A5-%EA%B0%9C%EC%84%A0%5D-%EC%95%8C%EB%A6%BC-%E2%80%90-4.-%40Async-%EB%8F%84%EC%9E%85%EA%B3%BC-%EC%8A%A4%EB%A0%88%EB%93%9C-%ED%92%80-%EB%B3%91%EB%AA%A9-%EB%B6%84%EC%84%9D)
> <br> 🔗 [5. 커스텀 TaskExecutor 튜닝](https://github.com/team-2percent/Athena_Backend/wiki/%5B%EC%84%B1%EB%8A%A5-%EA%B0%9C%EC%84%A0%5D-%EC%95%8C%EB%A6%BC-%E2%80%90-5.-%EC%BB%A4%EC%8A%A4%ED%85%80-TaskExecutor-%ED%8A%9C%EB%8B%9D)
> <br>


🔍 **프로젝트 검색**  
> 키워드, 카테고리  등을 활용한 프로젝트 탐색이 가능합니다.


<br>   


## 🛠️ 기술 스택


| Category         | Stack                                                                 |
|------------------|------------------------------------------------------------------------|
| **Language**     | ![Java](https://img.shields.io/badge/Java-21-007396?logo=java&logoColor=white) |
| **Framework**    | ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-6DB33F?logo=springboot) <br> ![Spring Batch](https://img.shields.io/badge/Spring%20Batch-6DB33F?logo=spring&logoColor=white) <br> ![Spring Security](https://img.shields.io/badge/Security-Spring-6DB33F?logo=springsecurity) ![JWT](https://img.shields.io/badge/JWT-0.12.4-blueviolet?logo=jsonwebtokens&logoColor=white) |
| **Database**     | ![MySQL](https://img.shields.io/badge/MySQL-5.7-4479A1?logo=mysql) <br> ![Redis](https://img.shields.io/badge/Redis-8.0.2-DC382D?logo=redis) <br> ![JPA](https://img.shields.io/badge/JPA-Hibernate-59666C?logo=hibernate) <br> ![QueryDSL](https://img.shields.io/badge/QueryDSL-Enabled-4B8BBE) |
| **DevOps**       | ![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white)
| **CI/CD**        | ![GitHub Actions](https://img.shields.io/badge/GitHub%20Actions-Automated-2088FF?logo=githubactions&logoColor=white) |
| **Notification** | ![Firebase](https://img.shields.io/badge/FCM-Firebase-FFCA28?logo=firebase&logoColor=white) |
| **Testing & Monitoring** | ![JUnit5](https://img.shields.io/badge/JUnit-5-25A162?logo=jest&logoColor=white) <br> ![Apache JMeter](https://img.shields.io/badge/JMeter-Performance%20Test-D22128?logo=apachejmeter&logoColor=white) <br> ![Signoz](https://img.shields.io/badge/Signoz-Observability-4B32C3?logo=signoz&logoColor=white) <br> ![JaCoCo](https://img.shields.io/badge/JaCoCo-0.8.11-BB4B4B?logo=codecov&logoColor=white) |
| **Docs**         | ![Swagger](https://img.shields.io/badge/Swagger-2.8.3-85EA2D?logo=swagger&logoColor=black) |

<br>   
