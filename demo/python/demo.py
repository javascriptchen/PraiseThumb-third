import re

line = "xxx出生于1994年2月9日"
# line = "xxx出生于1994/2/9"
# line = "xxx出生于1994-2-9"
# line = "xxx出生于1994-02-09"
# line = "xxx出生于1994-02"

# regex_str = ".*出生于(\d{4}[年/-]\d{1,2}([月/-]$|[月/-]\d{1,2}[日]$|[月/-]\d{1,2}|$))"
regex_str = ".*出生于((19[0-9]{2}|20[0-9]{2})[年/-]\d{1,2}([月/-]$|[月/-]\d{1,2}[日]$|[月/-]\d{1,2}|$))"
match_obj = re.match(regex_str, line)
if match_obj:
    print(match_obj.group(1))
