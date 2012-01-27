# About Mule-Modules-Utils

Mule-Modules-Utils is a small library for making development of mule-modules simpler, and assuring consistency among them. It complements the [mule-devkit](https://github.com/mulesoft/mule-devkit) runtime and code-generation, by providing code frequently required by connectors, that falls under the following categories:

* Soft Exception handling

* Map-Object-Mapping

* Pagination

* Date conversions

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
 
We provide a all-dependencies distribution of mule-module-utils, you can get from the downloads section
