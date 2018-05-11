ACCOUNT = 'admin'
PASSWORD = '123'

print('please input account')
user_account = input()
print('please input password')
user_password = input()

if ACCOUNT == user_account and PASSWORD == user_password:
    print('login success')
else:
    print('fail')
