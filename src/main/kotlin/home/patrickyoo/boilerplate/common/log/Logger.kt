package home.patrickyoo.boilerplate.common.log

import org.slf4j.Logger
import org.slf4j.LoggerFactory

// new Function 이라는 객체를 생성하지 않으면서 아래 코드를 실행 시키겠다.
inline fun <reified T> T.logger(): Logger {
    // 내부 Companion 객체일경우 해당 객체 리턴
    if (T::class.isCompanion) {
        return LoggerFactory.getLogger(T::class.java.enclosingClass)
    }

    // 내부에서 호출이 아닐경우 아래 코드 리턴.
    return LoggerFactory.getLogger(T::class.java)
}