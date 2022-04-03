# Лабораторна робота - 3
Прачов Віталій ТМ-82. Варіант - 16.

# Start
Using Maven you can provide execution arguments for running specific task
Available tasks: `task5`,`task13`,`task25`,`task31`

To running `task5`:
 - `3` - is encrypt key
 - `Hello world!` - is text to encrypt
```bash
$ mvn package exec:java --quiet -DskipTests "-Dexec.args=task5 3 Hello world!"
```

To running `task13`:
- `azwybtmjnlurkhicvodsfegqpx` - is encrypt key
- `Text to crypt!` - is text to encrypt
```bash
$ mvn package exec:java --quiet -DskipTests "-Dexec.args=task13 azwybtmjnlurkhicvodsfegqpx Text to crypt!"
```

To running `task25`:
- `text test asd123 f agdfgsdfg2 ax` - is just text with arguments
```bash
$ mvn package exec:java --quiet -DskipTests "-Dexec.args=task25 text test asd123 f agdfgsdfg2 a"
```

To running `task31`:
- `z e a f b d123 c` - is just text with arguments
```bash
$ mvn package exec:java --quiet -DskipTests "-Dexec.args=task31 z e a f b d123 c"
```





# Tests
```bash
$ mvn test
```