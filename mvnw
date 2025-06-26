#!/usr/bin/env sh
if command -v mvn >/dev/null 2>&1; then
  mvn "$@"
else
  echo "Maven is not installed."
  exit 1
fi
