# skype2gitter

[![release](https://img.shields.io/badge/release-skype2gitter--0.1-brightgreen.svg?style=flat)](https://github.com/gleb-kosteiko/skype2gitter/releases/latest)
[![Build Status](https://travis-ci.org/gleb-kosteiko/skype2gitter.svg?branch=master)](https://travis-ci.org/gleb-kosteiko/skype2gitter)
[![Join the chat at https://gitter.im/skype2gitter/Lobby](https://badges.gitter.im/skype2gitter/Lobby.svg)](https://gitter.im/skype2gitter/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![License](https://img.shields.io/badge/License-WTFPL-brightgreen.svg)](https://raw.githubusercontent.com/gleb-kosteiko/skype2gitter/master/copying.txt)

Simple Skype to Gitter bridge. The bot echoes messages from Skype chat to Gitter.

#### How to run

You can download [archive](https://github.com/gleb-kosteiko/skype2gitter/releases/latest) with latest stable release and run it or clone the repo and build it with Gradle - `gradle dist`. It will generate zip archive in `build/dist` directory.

Next steps:
- unpack archive and populate `skype2gitter.properties`, there are 4 required property (skype.login, skype.password, gitter.chatname, gitter.token)
- run startup script (.bat or .sh)
- to be sure that app was started check console output of log file
- for viewing of statistics open Statistics page in browser (default url `localhost:8080/`, can be changed in properties)

*Feel free to make pull requests!*


---

**Copyright © Gleb Kosteiko**

This work is free. You can redistribute it and/or modify it under the
terms of the Do What The Fuck You Want To Public License, Version 2,
as published by Sam Hocevar. See the [COPYING](https://raw.githubusercontent.com/gleb-kosteiko/skype2gitter/master/copying.txt) file for more details.

