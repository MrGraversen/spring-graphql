# Spring + GraphQL Example

This is a sample project featuring Spring with data exposed through GraphQL.

## Challenges Solved

**Related to GraphQL**:
* Expose GraphQL using Spring controller
* Access JPA repository using GraphQL
* Filtering data based on GraphQL query
* *Completely avoiding* manually writing GraphQL schemas to resources

**Unrelated:**
* Use Project Lombok to bytecode-weave-in boilerplate code
* Use in-memory H2 database with JPA
* Use Spring Boot autoconfiguration to stand up JDBC

### Other Learnings
* If you use H2, you may add the following properties to enable H2 web UI: `spring.h2.console.enabled=true` and `spring.h2.console.path=/whatever`, then access it on `/whatever`.
* H2 does not fail if you connect to a database which does not exist, so *if you use the web UI*, make sure to connect to `jdbc:h2:mem:testdb` to hit the in-memory database. Otherwise, a flat-file database will be created.
* Lombok's `@Data` annotation is unfortunately not 100% suitable for JPA entities; I recommend also adding `@RequiredArgsConstructor` and `@NoArgsConstructor`.

## Opinion Zone 

* GraphQL and REST are not interchangeable; neither is a magic bullet.
* REST is more of an architectural structure, whereas GraphQL is "just" a data query specification.
* Although it is uncommonly embraced fully, REST focuses more on hypermedia controls than it does data query.
* If you are *not actually* designing a RESTful API (i.e. creating a RPC over HTTP API), GraphQL might be a good solution for you, as it enforces its own conventions.
* GraphQL makes it easier to deprecate things (field usage is specified by the client, not the server).
* GraphQL decouples client evolution from server evolution. Then again, so does REST **if** you use HATEOAS.
* GraphQL is pretty cool and I will use it *in addition* to my REST structure.
