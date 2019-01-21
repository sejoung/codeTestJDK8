package com.github.sejoung.codetest.annotation.markerannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 테스트 메서드임을 선언하는 애너테이션이다.
 * 매개변수 없는 정적 메서드 전용이다.
 */
// 런타임에도 유지되어야 한다.
@Retention(RetentionPolicy.RUNTIME)
// 메소드만 타겟이다.
@Target(ElementType.METHOD)
public @interface Test{

}
