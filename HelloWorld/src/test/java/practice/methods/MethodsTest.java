package practice.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    @Test
    void stringBinder() {
        // given: 테스트에 활용할 데이터
        String str1 = "string";
        String str2 = "binder";

        // when: 테스트할 중점 액션 실행
        String result = Methods.stringBinder(str1, str2);

        // then: 결과가 의도와 맞는지 판별. 결과값 직접 작성해 줘야 함.
        assertEquals("stringbinder", result);
    }
}