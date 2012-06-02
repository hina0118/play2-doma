package plugin.doma;

import play.mvc.*;
import play.mvc.Http.*;

import java.util.*;
import java.lang.annotation.*;

/**
 * アクションにDomaのトランザクションを適用するために使用するアノテーション
 */
@With(TransactionalAction.class)
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Transactional {
    Class configClass();
}