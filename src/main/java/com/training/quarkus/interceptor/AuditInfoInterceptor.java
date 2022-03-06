package com.training.quarkus.interceptor;

import com.training.quarkus.annotation.AuditInfo;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;
import org.apache.commons.lang3.time.StopWatch;

import java.text.MessageFormat;

// FIXME: Missing annotations. Check examples here: https://quarkus.io/guides/cdi#interceptors
@Priority(0)
class AuditInfoInterceptor {

    // FIXME: Missing annotation. Check options here: https://quarkus.io/guides/cdi#interceptors
    public Object logAuditInfo(final InvocationContext context) throws Exception {
        final var stopWatch = new StopWatch();
        stopWatch.start();

        // FIXME: .
        final var result = context.proceed();

        stopWatch.stop();

        log(context, stopWatch);

        return result;
    }

    private void log(final InvocationContext context, final StopWatch stopWatch) {
        final var auditInfo = context.getInterceptorBindings(AuditInfo.class).iterator().next();

        final var className = context.getMethod().getDeclaringClass().getName();
        final var method = context.getMethod().getName();
        final var phoneNumber = Arrays.stream(context.getParameters()).iterator().next();

        System.out.println(MessageFormat.format(">> Method [{0}{1}] annotated with OperationId=[{2}] and ResourceId=[{3}] " +
                        "invoked with [{4}] was finished in [{5}] nanoseconds.",
                className, method, auditInfo.operation(), auditInfo.resourceId(), phoneNumber, stopWatch.getNanoTime()));
    }
}
