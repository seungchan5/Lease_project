# :pushpin: 중고 캠핑 용품 대여 중개 플랫폼 
- 캠핌을 떠나기 위해 캠핑장비를 구매했지만 떠날 시간이 없는 개인과 캠핑을 떠나고 싶지만 고가의 캠핑장비 구매를 망설이는 개인을 중개하여 대여 거래가 이루어지도록 도와주는 플랫폼
</br>

## 1. 제작 기간 & 참여 인원
-   2023년 07월 26일 ~ 2023년 08월 18일
-   팀 프로젝트(6인)
</br>

## 2. 개발도구 및 환경

-   Java 11
-   Spring Boot 2.7.14
-   Oracle 11g
-   MyBatis 2.3.1
-   Apache Tomcat 9.0.78
-   SpringToolSuite 4
-   Gradle

</br>

## 3. 프로젝트 주요 기능
- 로그인(회원가입, ID/PW 찾기, 네이버/카카오 로그인)
- 상품등록
- 상품 대여하기
- 마이페이지(대여 물품 확인, 대여 승인 및 거절, 쪽지하기, 정산금액 확인, 개인 정보 변경)
</br>

## 4. 나의 역할
- 로그인 관련 기능 구현
  - 로그인, 네이버/카카오 로그인, 회원가입, ID/PW 찾기 `Controller : july/lease/controller/MemberController.java` : [코드확인](https://github.com/seungchan5/Lease_project/blob/main/src/main/java/july/lease/controller/MemberController.java)
  - 문자인증 API `Controller : july/lease/controller/SmsController.java` : [코드확인](https://github.com/seungchan5/Lease_project/blob/main/src/main/java/july/lease/controller/SmsController.java)
  - 로그인 인터셉터 `Intercepter : july/lease/intercepter/LoginIntercepter.java` : [코드확인](https://github.com/seungchan5/Lease_project/blob/main/src/main/java/july/lease/intercept/LoginInterceptor.java)

 </br>


## 5. ERD 설계
![erd](https://github.com/seungchan5/Lease_project/assets/126455161/0fdc2ca6-686c-46a4-ab71-8d9fbdcf51f1)

</br>

## 6. 핵심 트러블 슈팅

- 로그인을 하지 않은 사용자가 로그인이 필요한 기능을 실행한 경우 LoginIntercepter를 통해 로그인 페이로 이동하고 로그인을 완료하면 실행했던 페이지로 돌아가는 과정

<details>
<summary><b>LoginInterceptor</b></summary>
<div markdown="1">
  
`july/lease/interceptor/LoginInterceptor.java`

```java
@Component
public class LoginInterceptor implements HandlerInterceptor {
		
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String requestURI = request.getRequestURI();
		
		HttpSession session = request.getSession();
		if(session.getAttribute("memberId")== null) {			
			System.out.println(requestURI);
			response.sendRedirect("/login?redirectURL=" + requestURI);
			
			return false;
		}
		
		return true;
		
	}
	
}

```

</div>
</details>

- 일반회원
  - LoginInterceptor에서 getRequestURI를 통해 실행했던 페이지의 경로를 받아 sendRedirect로 로그인 페이지에 전달하여 로그인하는 Member 객체에 직접 저장했습니다.
  - MemberController에서 객체가 경로값을 갖고 있는지 구분하여 map에 담아 반환해 fetch를 통해 실행되도록 구현하였습니다. 
- 네이버/카카오 로그인 회원
  - 
