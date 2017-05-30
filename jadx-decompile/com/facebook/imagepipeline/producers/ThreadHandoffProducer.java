package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.util.concurrent.Executor;

public class ThreadHandoffProducer<T> implements Producer<T> {
    @VisibleForTesting
    protected static final String PRODUCER_NAME = "BackgroundThreadHandoffProducer";
    private final Executor mExecutor;
    private final Producer<T> mInputProducer;

    public ThreadHandoffProducer(Executor executor, Producer<T> producer) {
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
        this.mInputProducer = (Producer) Preconditions.checkNotNull(producer);
    }

    public void produceResults(Consumer<T> consumer, ProducerContext producerContext) {
        ProducerListener listener = producerContext.getListener();
        String id = producerContext.getId();
        final ProducerListener producerListener = listener;
        final String str = id;
        final Consumer<T> consumer2 = consumer;
        final ProducerContext producerContext2 = producerContext;
        final Runnable anonymousClass1 = new StatefulProducerRunnable<T>(consumer, listener, PRODUCER_NAME, id) {
            protected void disposeResult(T t) {
            }

            protected T getResult() {
                return null;
            }

            protected void onSuccess(T t) {
                producerListener.onProducerFinishWithSuccess(str, ThreadHandoffProducer.PRODUCER_NAME, null);
                ThreadHandoffProducer.this.mInputProducer.produceResults(consumer2, producerContext2);
            }
        };
        producerContext.addCallbacks(new BaseProducerContextCallbacks() {
            public void onCancellationRequested() {
                anonymousClass1.cancel();
            }
        });
        this.mExecutor.execute(anonymousClass1);
    }
}
