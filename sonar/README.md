# eslint-plugin-sonar-test

sonar-test

## Installation

You'll first need to install [ESLint](http://eslint.org):

```
$ npm i eslint --save-dev
```

Next, install `eslint-plugin-sonar-test`:

```
$ npm install eslint-plugin-sonar-test --save-dev
```


## Usage

Add `sonar-test` to the plugins section of your `.eslintrc` configuration file. You can omit the `eslint-plugin-` prefix:

```json
{
    "plugins": [
        "sonar-test"
    ]
}
```


Then configure the rules you want to use under the rules section.

```json
{
    "rules": {
        "sonar-test/rule-name": 2
    }
}
```

## Supported Rules

* Fill in provided rules here





