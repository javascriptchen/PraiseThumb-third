origin = 0
def factory(pos):
    def go(step):
        nonlocal pos  #不是局部变量
        new_pos = pos + step
        pos = new_pos
        return pos
    return go
turist = factory(origin)
print(turist(2))
print(turist(3))
print(turist(6))