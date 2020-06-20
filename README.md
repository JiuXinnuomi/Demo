接口

> 查询:GET 增加:POST 修改:PUT 删除:DELETE

### 用户头像地址

/avatar/{用户id}



### 登陆用户信息

- URL: /login

- METHOD: GET

- 参数：

  | 参数名   | 类型   | 描述 |
  | -------- | ------ | ---- |
  | Username | String |      |
  | Password | String |      |



### 注册

- URL: /register

- METHOD: POST

- 参数：

  | 参数名   | 类型   | 描述 |
  | -------- | ------ | ---- |
  | Username | String |      |
  | Nickname | String |      |
  | Password | String |      |



### 获取个人计划

- URL: /priPlan
- METHOD: GET
- 参数：

| 参数名 | 类型   | 描述 |
| ------ | ------ | ---- |
| UersId | Number |      |







### 获取所有团队计划

- URL: /pubPlan
- METHOD: GET
- 参数：

| 参数名 | 类型   | 描述 |
| ------ | ------ | ---- |
| UserId | Number |      |



### 获取被关注记录

- URL: /focused
- METHOD: GET
- 参数：

| 参数名 | 类型   | 描述 |
| ------ | ------ | ---- |
| UserId | Number |      |



### 获取关注记录

- URL: /focuser
- METHOD: GET
- 参数：

| 参数名 | 类型   | 描述 |
| ------ | ------ | ---- |
| UserId | Number |      |





### 获取团队计划内容

- URL: /planContent
- METHOD: GET
- 参数：

| 参数名 | 类型   | 描述 |
| ------ | ------ | ---- |
| PlanId | Number |      |





### 增加个人计划

- URL: /priPlan
- METHOD: POST
- 参数：

| 参数名  | 类型   | 描述 |
| ------- | ------ | ---- |
| Sustain | Number |      |
| Content | String |      |



### 增加团队计划

- URL: /pubPlan
- METHOD:POST
- 参数：

| 参数名  | 类型   | 描述 |
| ------- | ------ | ---- |
| Sustain | Number |      |
| Title   | String |      |



### 增加团队计划成员

- URL: /pubPlaner
- METHOD:POST
- 参数：

| 参数名 | 类型   | 描述 |
| ------ | ------ | ---- |
| PlanId | Number |      |
| UserId | Number |      |



### 增加关注记录

- URL: /star
- METHOD: POST
- 参数：

| 参数名 | 类型   | 描述 |
| ------ | ------ | ---- |
| UserId | Number |      |





### 增加团队计划内容

- URL: /planContent
- METHOD: POST
- 参数：

| 参数名  | 类型   | 描述 |
| ------- | ------ | ---- |
| PlanId  | Number |      |
| Content | String |      |



### 修改用户信息

- URL: /user

- METHOD: PUT

- 参数：

  | 参数名   | 类型   | 描述 |
  | -------- | ------ | ---- |
  | Username | String |      |
  | Nickname | String |      |
  | Password | String |      |



### 修改个人计划

- URL: /priPlan
- METHOD:PUT
- 参数：

| 参数名  | 类型   | 描述 |
| ------- | ------ | ---- |
| Sustain | Number |      |
| Content | String |      |
| Id      | Number |      |



### 修改团队计划

- URL: /pubPlan
- METHOD:PUT
- 参数：

| 参数名  | 类型   | 描述 |
| ------- | ------ | ---- |
| Sustain | Number |      |
| Title   | String |      |
| Id      | Number |      |





### 修改团队计划内容

- URL: /planContent
- METHOD: PUT
- 参数：

| 参数名  | 类型   | 描述 |
| ------- | ------ | ---- |
| PlanId  | Number |      |
| Content | String |      |





### 删除个人计划

- URL: /priPlan
- METHOD: DELETE
- 参数：

| 参数名 | 类型   | 描述 |
| ------ | ------ | ---- |
| Id     | Number |      |



### 删除团队计划

- URL: /pubPlan
- METHOD: DELETE
- 参数：

| 参数名 | 类型   | 描述 |
| ------ | ------ | ---- |
| Id     | Number |      |



### 删除关注记录

- URL: /star
- METHOD: DELETE
- 参数：

| 参数名 | 类型   | 描述 |
| ------ | ------ | ---- |
| Id     | Number |      |



### 搜索用户

- URL: /search
- METHOD: POST
- 参数：

| 参数名 | 类型   | 描述 |
| ------ | ------ | ---- |
| key    | String |      |

