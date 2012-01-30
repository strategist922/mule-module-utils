# About Mule-Modules-Utils

Mule-Modules-Utils is a small library for making development of mule-modules simpler, and assuring consistency among them. It complements the [mule-devkit](https://github.com/mulesoft/mule-devkit) runtime and code-generation, by providing code frequently required by connectors, that falls under the following categories:

* Soft Exception handling

* Map-Object-Mapping: based on [MOM](https://github.com/zauberlabs/commons-mom), offers `org.mule.modules.utils.mom.JaxbMapObjectMappers`, hub for creating mappers that are aware of Jaxb generated classes and Mule date conventions, useful when developing Connectors that interfact with REST or SOAP interfaces. 

* Pagination

* Date conversions: provides and integrates with `org.mule.modules.utils.date.DateConventions`, a class for performing date parsing consistently across connectors, using ISO Date format: 

  * 2012-01-09T12:18:14Z
  * 2012-01-09T12:18:14-02:00
  * 2012-01-09T12:18:14
  * 2012-01-09
 
 Connector implementors should use always this date converter in order to grant consistency across connectors. 

Unlike the devkit, it is aimed to be used as a maven dependency in your connector, and not as a build plugin. In addition, its inclusion to your project is not mandatory, but recommended as long as you require to add any of the previous features to it. 


# Adding it to you module

## With Maven

Adding it to your connector project is easy, just include it as a maven dependency:

```xml
  <properties>
    <mule.module.utils.version>1.0</mule.module.utils.version>
    ...
  </properties>

  ...
  
  <dependencies>
    <dependency>
      <groupId>org.mule.modules</groupId>
      <artifactId>mule-modules-utils</artifactId>
      <version>${mule.module.utils.version}</version>
    </dependency>
    ...
  </dependencies>
```

## Without Maven
 
We provide a all-dependencies distribution of mule-module-utils, you can get from the [downloads](downloads) section
