# 3주차: 자바 객체지향 프로그래밍 (상속, 다형성, 추상화)

이 프로젝트는 자바의 핵심 객체지향 원칙인 상속, 다형성, 추상화를 실습하기 위해 사자(Lion) 역할 관리 시스템을 구현한 예제입니다.

## 1. 추상화 (Abstraction)
- **Lion (추상 클래스)**: 모든 사자 역할의 공통 속성(이름, 전공, 기수 등)과 공통적으로 수행해야 할 행동을 정의합니다. `abstract` 키워드를 사용하여 직접 인스턴스화할 수 없도록 설계되었으며, 자식 클래스에서 반드시 구현해야 하는 추상 메서드(`showInfo`, `inputLionInformation` 등)를 포함합니다.
- **Policy (인터페이스)**: 특정 정책 허용 여부를 판단하는 `isPolicyAllowed` 메서드를 정의하여, 다양한 정책 구현체가 동일한 규격을 따르도록 합니다.

## 2. 상속 (Inheritance)
- `StudentLion`, `OperatorLion`, `GraduateStudentLion` 클래스는 `Lion` 추상 클래스를 상속받습니다.
- 부모 클래스의 필드와 메서드를 재사용하며, 각 역할에 특화된 필드(학번, 직책, 현재 직무 등)를 추가하여 기능을 확장했습니다.

## 3. 다형성 (Polymorphism)
- `Main` 클래스에서 `Lion` 타입의 참조 변수로 `StudentLion`, `OperatorLion` 등의 서로 다른 객체를 참조합니다.
- 동일한 메서드 호출(`lion.showInfo()`)에도 불구하고, 실행 시점에 실제 참조하고 있는 객체의 타입에 따라 각각 다른 동작이 수행되는 동적 바인딩(Dynamic Binding)을 보여줍니다.

## 클래스 구조
- `role/`: 사자의 종류별 역할을 정의 (Lion, StudentLion, OperatorLion, GraduateStudentLion)
- `policy/`: 역할별 정책을 정의 (Policy interface 및 구현체들)
- `Main.java`: 프로그램 실행 및 다형성 원리 확인

## 작업 후기
- `role` 디렉토리의 작업을 진행하며 다형성의 원리를 명확하게 깨닫게 되었습니다. 부모 클래스인 `Lion`이라는 공통의 타입으로 각기 다른 특성을 가진 `StudentLion`, `OperatorLion`, `GraduateStudentLion` 객체들을 통합적으로 관리하고 실행하는 과정을 통해, 객체지향 프로그래밍이 제공하는 코드의 유연성과 확장성을 직접 경험할 수 있었습니다.
