# 2시간 타임어택으로 만든 명함관리 프로그램

명함관리 도메인 설계 : 어렵지 않았다.

Spring MVC에 대한 이해 : 하도 오랜만에 봐서 힘들었다.

타임리프 사용법 : model로 전달받은 정보를 꺼내 쓸 때 사용함 타임리프
부분은 챗지피티의 도움을 아주 많이받음

Repository : SQL의 like구문을 메서드 쿼리로 작성하는 법이 있었음 containing을 알게됨

bootStrap : 간만에 써서 쓰는맛 좀 났다. 예전에 github 블로그 만든다고
이리저리 꼼지락 댔던게 도움이 됐다.

#### 아쉬운점 : 사용성
1. 명함이 저장이 완료되었다면 페이지를 이동하지 않고 alert로 줬어도
   됐었다. 근데 그 방법은 모름
2. 꼭꼭 페이지를 이동함, 결과 페이지를 알기위해서 결과 페이지로 꼭
      이동함 1번과 비슷한 맥락
      A페이지에서 작업을 완료하고 결과를 A페이지에서 동적으로 확인하는게
      아니라 결과 페이지인 B로 이동해야했었다.

#### 부족한점 : MVC
      간만에 MVC를 통해서 구성을 했는데 지금까지 쭉 API만을 통해서
      front와 통신하는 방식으로 작업을 수행했기 때문에 Spring생태계의
      MVC특히 View에 대해서 잘 모른다는 생각이 들었고 어떤식으로 Model이
      작동하는지? 이해가 필요하다고 느꼇다.

#### 후기 :
      생각보다 빨리 만들어서 놀람

---
# 240919 17:00 refact : RegisterController + SearchController
서로 다르게 구현되어 있던 RegiestController+ SearchController를 하나로 합쳐 
BusinessCardController로 변경했습니다!
