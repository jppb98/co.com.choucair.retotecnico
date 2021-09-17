#Autor: Juan Pablo Patiño Bedoya

@stories

Feature: technical challenge
    As a user, i want to do a technical challenge that show what did i learn with the automation course

    @scenario1
    Scenario Outline: Create a new user in Utest
        Given than juan wants to create a new user in Utest page
        When he enters to the UTest page and complete the form
            | firstName   | lastName   | email   | birthMonth   | birthDay   | birthYear   | zipCode   | mobileDevice   | model   | operatingSystem   | password   | confirmPassword   | welcomeMessage  |
            | <firstName> | <lastName> | <email> | <birthMonth> | <birthDay> | <birthYear> | <zipCode> | <mobileDevice> | <model> | <operatingSystem> | <password> | <confirmPassword> | <welcomeMessage |
        Then he creates the new user
        
        Examples:
            | firstName | lastName | email                        | birthMonth | birthDay | birthYear | zipCode | mobileDevice | model        | operatingSystem | password        | confirmPassword | welcomeMessage |
            | Juan      | Pablo    | juanchomanito.jppb@gmail.com | August     | 12       | 1998      | 050026  | Motorola     | Moto E6 Plus | Android 9       | Un@9au5Ts.s.6FG | Un@9au5Ts.s.6FG | Welcome to the world's largest community of freelance software testers! |


