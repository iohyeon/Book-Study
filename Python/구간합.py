n, m = map(int, input().split())
data = list(map(int, input().split()))
calc_data = []
for i in range(m):
    calc_data.append(list(map(int, input().split())))

sum_value = 0
prefix_sum = [0]
for i in data:
    sum_value += i
    prefix_sum.append(sum_value)

for i in calc_data:
    print(prefix_sum[i[1]] - prefix_sum[i[0] - 1])

#https://www.acmicpc.net/problem/11659