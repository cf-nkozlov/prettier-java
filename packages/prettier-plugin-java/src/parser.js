"use strict";

const javaParser = require("@cf-nkozlov/java-parser");

function parse(text, parsers, opts) {
  return javaParser.parse(text, opts.entrypoint);
}

module.exports = parse;
