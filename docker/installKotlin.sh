#!/bin/bash
cd /root
curl -s https://get.sdkman.io | bash
source /root/.sdkman/bin/sdkman-init.sh
sdk install kotlin
