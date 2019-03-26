def square_number(a):
    return a** 2
print(square_number(2))

def test_square_number():
    assert square_number(2)==4
    assert square_number(3)==9
    print('YOUR CODE IS CORRECT')


test_square_number()
