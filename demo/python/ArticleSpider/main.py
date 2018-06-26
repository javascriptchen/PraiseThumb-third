from scrapy.cmdline import execute
# 调用这个函数可以执行scrapy的脚本
import sys
# 需要设置工程目录，调用execute才会生效
import os

# 获取当前main文件的父目录

sys.path.append(os.path.dirname(os.path.abspath(__file__)))
execute(["scrapy", "crawl", "jobbole"])
# 执行spider命令
