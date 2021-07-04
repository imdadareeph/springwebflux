# springwebflux
springwebflux reactive programming

Example1.

```console
Flux<String> flux = Flux.generate(
    () -> 0, 
    (state, sink) -> {
      sink.next("3 x " + state + " = " + 3*state); 
      if (state == 10) sink.complete(); 
      return state + 1; 
    });
```

![alt text](https://raw.githubusercontent.com/imdadareeph/springwebflux/main/screenshots/1.png "preview1")
![alt text](https://raw.githubusercontent.com/imdadareeph/springwebflux/main/screenshots/2.png "preview2")