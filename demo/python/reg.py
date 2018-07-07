import re

line = "chen"
reg_str = "(c|ch)"
match_obj = re.match(reg_str, line)
if match_obj:
    print(match_obj.group(1))
