import requests
import re

try:
    import cookielib
except:
    import http.cookiejar as cookielib

agent = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:57.0) Gecko/20100101 Firefox/57.0"
header = {
    "HOST": "www.zhihu.com",
    "Referer": "https://www.zhihu.com",
    "User-Agent": agent
}


def get_xsrf():
    response = requests.get("https://www.zhihu.com", headers=header)
    print(response.text)
    return ""


def zhihu_login(account, password):
    # 知乎登录
    if re.match("^1\d{10}", account):
        print("手机号码登录")
        post_url = "https://www.zhihu.com/login/phone_num"
        post_data = {
            "_xsrf": get_xsrf,
            "phone_num": account,
            "password": password,
        }


get_xsrf()
