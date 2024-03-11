# Notas Interfaces funcionales

- Function <T, R>  (R apply(T t))
- BiFunction<T,U,R> (R apply(T t, U u))

- Predicat<T> (Boolean test(T t))
- BiPredicate<T,U> (Boolean test(T t, U u))

- Consumer<T> (void accept(T t))
- BiConsumer<T,U> (void accept(T t, U u))

- Supplier<R> (R get())

- UnaryOperator<T> (T apply(T t))
- BinaryOperator<T> (T apply(T t, T t))
