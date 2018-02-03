# Spring Bootiful Microservices (Config-Service)

#### Navigation Guide: [`Next Repo: Config-Repo`](https://github.com/Prempeh-Gyan/1.1-Config-Repo)

### Travis
[![Build Status](https://travis-ci.org/Prempeh-Gyan/1.0-Config-Service.svg?branch=master)](https://travis-ci.org/Prempeh-Gyan/1.0-Config-Service)

### Heroku
To deploy this project to Heroku, update the [`configuration file`](https://github.com/Prempeh-Gyan/1.0-Config-Service/blob/master/src/main/resources/bootstrap.yml) to point to the Heroku locations of the dependent services before deploying this to Heroku.

[![Deploy](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy?template=https://github.com/Prempeh-Gyan/1.0-Config-Service)

### Getting Started
*Required*
* [`Maven`](https://maven.apache.org/) 3.3+
* [`JDK`](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 8+
Get the project from the source repository
>`git clone https://github.com/Prempeh-Gyan/1.0-Config-Service.git`

### About This Service
This Config-Service centralizes the management of configuration files from all the `Bootiful Microservices` in this series.

As any of the services in the `Bootiful Microservices` series moves through the deployment pipeline from development to test and into production, this Config-Service manages the configuration between environments and guarantees that the application has everything it needs to run when you migrate it.

For locating property sources, the Config-Server has been configured to clone the [`git repository : Config-Repo`](https://github.com/Prempeh-Gyan/1.1-Config-Repo) and use it for initialization.

### Running the Project
To run the project, first navigate into the source directory `cd 1.0-Config-Service` and execute the following command:

* `mvn spring-boot:run`:
