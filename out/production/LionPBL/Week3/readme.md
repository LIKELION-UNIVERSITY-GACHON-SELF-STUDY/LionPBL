

# 배운점
## if문 단순화
return에 사용하던 if문을 단순화 시킬 수 있다. 

- 기존 코드
``` java
if (num  >= 14)
    return true
return false
```
단순화 코드
``` java
return num >= 14
```
## 추상화
abstract 구문을 이용해 추상클래스를 생성할 수 있다.  

이를 통해 하위클래스들의 기본값을 통일시킬 수 있다. Interface랑은 약간 다른 개념이다.

참조: [추상 클래스 용도 이해하기](https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%B6%94%EC%83%81-%ED%81%B4%EB%9E%98%EC%8A%A4Abstract-%EC%9A%A9%EB%8F%84-%EC%99%84%EB%B2%BD-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0)
## overloading