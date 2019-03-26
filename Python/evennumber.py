def is_even(num):
    if num % 2 == 0:
        return True
    else:
        return False
print(is_even(212))

def test_is_even():
    assert is_even(2)== True
    assert is_even(212)== True
    assert is_even(3)== False
    print('YOUR CHOICE IS CORRECT')

test_is_even()
