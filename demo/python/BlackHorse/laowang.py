class Person(object):
    """"人的类"""

    def __init__(self, name):
        super(Person, self).__init__()  # 调用父类的__init__方法
        self.name = name
        self.gun = None
        self.hp = 100

    def anzhuang_zidan(self, dan_jia_temp, zi_dan_temp):
        """把子弹装到弹夹中"""
        dan_jia_temp.save_zidan(zi_dan_temp)

    def anzhuang_danjia(self, gun_temp, dan_jia_temp):
        gun_temp.save_danjia(dan_jia_temp)

    def naqiang(self, gun_temp):
        """拿起一把枪"""
        self.gun = gun_temp

    def shoot(self, diren):
        """让枪发射子弹打敌人"""
        self.gun.fire(diren)

    def diao_xue(self, sha_shang_li):
        """根据杀伤力掉血"""
        self.hp -= sha_shang_li

    def __str__(self):
        if self.gun:
            return "%s的血量为%d,他有枪,枪是%s" % (self.name, self.hp, self.gun)
        else:
            if self.hp > 0:
                return "%s的血量为%d,他没有枪" % (self.name, self.hp)
            else:
                return "%s已挂" % (self.name)


class Gun(object):
    """"枪的类"""

    def __init__(self, name):
        super(Gun, self).__init__()  # 调用父类的__init__方法
        self.name = name  # 用来记录枪的类型
        self.danjia = None  # 用来记录弹夹对象的引用

    def save_danjia(self, dan_jia_temp):
        """用一个属性来保存这个弹夹的引用"""
        self.danjia = dan_jia_temp

    def fire(self, diren):
        """枪从弹夹中获得一枚子弹，子弹打的敌人"""
        # 先从弹夹中取出子弹
        zidan_temp = self.danjia.tanchu_zidan()
        # 让子弹去伤害敌人
        if zidan_temp:
            zidan_temp.dazhong(diren)
        else:
            print("弹夹中没有子弹了。。。")

    def __str__(self):
        if self.danjia:
            return "枪的名字为：%s，%s" % (self.name, self.danjia)
        else:
            return "枪的名字为：%s，这把枪没有弹夹 " % (self.name)


class Danjia(object):
    """"弹夹的类"""

    def __init__(self, max_num):
        super(Danjia, self).__init__()  # 调用父类的__init__方法
        self.max_num = max_num  # 最大子弹数
        self.zidan_list = []  # 用来记录所有子弹的引用

    def save_zidan(self, zi_dan_temp):
        """将这颗子弹保存"""
        self.zidan_list.append(zi_dan_temp)

    def tanchu_zidan(self):
        """弹出最上面的那颗子弹"""
        if self.zidan_list:
            return self.zidan_list.pop()
        else:
            return None

    def __str__(self):
        return "弹夹的信息为%d/%d" % (len(self.zidan_list), self.max_num)


class ZiDan(object):
    """"子弹的类"""

    def __init__(self, sha_shang_li):
        super(ZiDan, self).__init__()  # 调用父类的__init__方法
        self.sha_shang_li = sha_shang_li  # 子弹威力

    def dazhong(self, diren):
        # 让敌人掉血，一颗子弹的威力
        diren.diao_xue(self.sha_shang_li)


def main():
    """"用来控制整个程序的流程"""
    # 1.创建一个老王对象
    laowang = Person("老王")
    # 2.创建枪对象
    ak47 = Gun("ak47")
    # 3.创建弹夹对象
    dan_jia = Danjia(20)
    # 4.创建子弹对象
    for i in range(15):
        zi_dan = ZiDan(10)
        # 5.老王把子弹安装到弹夹中
        # 老王.安装子弹到弹夹中（弹夹，子弹）
        laowang.anzhuang_zidan(dan_jia, zi_dan)

    # 6.老王把弹夹安装到枪中
    laowang.anzhuang_danjia(ak47, dan_jia)

    # 测试弹夹信息
    # print(dan_jia)
    # 测试枪的信息
    # print(ak47)
    # 7.老王拿枪
    # 老王.拿枪（枪 ）
    laowang.naqiang(ak47)
    # test:老王拿枪
    print(laowang)

    # 8.创建一个敌人
    gebi_laosong = Person("隔壁老宋")
    print(gebi_laosong)
    # 9.老王开枪打敌人
    for i in range(11):
        laowang.shoot(gebi_laosong)
        print(laowang)
        print(gebi_laosong)


if __name__ == "__main__":
    main()
