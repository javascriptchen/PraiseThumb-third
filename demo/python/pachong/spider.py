from urllib import request
import re
class Spider():
    url = "https://www.zhihu.com/#signin"
    root_pattern = '<div class="shizhan-course-wrap l ">[\s\S]*?</div>'


    def __fetch_content(self):
        r = request.urlopen(Spider.url)
        htmls = r.read()
        htmls = str(htmls,encoding="utf-8")
        return htmls
    
    def __analysis(self,htmls):

        root_html = re.findall(Spider.root_pattern,htmls)

        a=1

    def go(self):
        htmls = self.__fetch_content()
        self.__analysis(htmls)

spider = Spider()
spider.go()