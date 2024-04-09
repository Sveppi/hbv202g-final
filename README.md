# Málsháttur

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

## Description

'Málsháttur' is a randomizer that allows you to get a random idiom from a collection of over 800 Icelandic idioms, perfect for Easter! You can also favorite up to ten idioms at a time.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Design](#design)
- [License](#license)
- [Contact](#contact)

## Installation

'mvn install' compiles the program through Maven.

Or a JAR can be create by running the command 'source createjar.cmd'.

## Usage

Run the program through Maven with the command 'mvn exec:java'.

Or the created JAR can then be run with the command 'source runjar.cmd'.

You interact with the program through a CLI. At each step the valid options are printed for you. Simply type in what you want to do:

- "nyjan" : get a random idiom
- "vista" : save the current idiom to favorites
- "skoda" : view your favorites
- "haetta" : quit the program

While in the favorites view you can also delete from the favorites by typing the number of the favorite. You can return to the main randomizer by typing "baka".

To generate the documentation, use command 'mvn site'.

## Design

[A UML diagram of the project design](./src/site/markdown/design.md)

The project utilizes the Command pattern to execute the correct command on the input from the user.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

- Email: svs37@hi.is
- GitHub: [Sveppi](https://github.com/Sveppi)
