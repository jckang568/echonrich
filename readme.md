# 에코앤리치 코딩과제(Back-End)

### 코딩 과제 목표
* 개발 아이디어 및 지원자의 보유 기술의 활용도를 보기 위함.
* 기본적인 주제(과제)를 어떻게 풀어나가는지 보는 것이 주 목적.


### 구현스펙
* 임의의 더미데이터가 삽입되어있는 DB스키마 구성
  * [Oracle의 HR스키마의 더미데이터 사용(더미데이터 추가 필요)](https://github.com/nomemory/hr-schema-mysql/blob/master/hr-schema-mysql.sql)
* API에서 제공하는 기능은 GET/POST 등의 방식의 Method Type을 활용하여 구축할 것
* 응답의 Response 규격은 json 혹은 XML 방식으로 구성

### 구현기능
* 특정 사원의 현재 정보 조회 가능한 API 구현
* 특정 사원의 이력 정보 조회 가능한 API 구현
* 부서 및 위치 정보 조회 가능한 API 구현
* 특정 부서의 급여를 특정 비율로 인상 및 사원 정보 업데이트 할 수 있는 API 구현
* RDBMS스키마와 별개로 [공공 데이터 포털](data.go.kr) 등에서 임의의 API 선택 후 조회 가능하도록 커스터마이징 된 API 구현

### 권장 활용 기술
* Java(Spring), Node.js(Express.js or NestJS), Python(Django or Flask)
* MySQL(MariaDB), PostgreSQL 중 택1
* AWS에 서버 구(Stand-Alone 방식)
* Github로 열람 가능하도록 소스 공개

### 주의 사항
* 기본 구현 기능 외에 정답은 없으니, 권장 활용 기술 외의 기술이어도 편한대로 자유롭게 개발 진행
* Github, 호스팅 URL은 볼 수 있도록 public 상태인지 체크
* 기한은 1주일
* 확인 가능한 API 명세서 제공이 필요
* AWS 미사용 시에도 상시 확인 가능한 URL 공유