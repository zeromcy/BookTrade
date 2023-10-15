// 查询订单列表页接口
const getOrderDetailPage = (params) => {
  return $axios({
    url: '/order/page',
    method: 'get',
    params
  })
}

// 查询订单列表页接口
const getOrderedDetailPage = (params) => {
  return $axios({
    url: '/order/page/send',
    method: 'get',
    params
  })
}


// 查询列表页接口
const getShopDetailPage = (params) => {
  return $axios({
    url: '/shop/page',
    method: 'get',
    params
  })
}

// 查询列表页接口
const getMyOrderDetailPage = (params) => {
  return $axios({
    url: '/shop/order',
    method: 'get',
    params
  })
}

// 查询列表页接口
const getOrderpDetailPage = (params) => {
  return $axios({
    url: '/address/page',
    method: 'get',
    params
  })
}

// 查看接口
const queryOrderDetailById = (id) => {
  return $axios({
    url: `/orderDetail/${id}`,
    method: 'get'
  })
}

// 取消，派送，完成接口
const payApi = (params) => {
  return $axios({
    url: '/order',
    method: 'put',
    data: params
  })
}


// 默认地址
const setDefaultApi = (params) => {
  return $axios({
    url: '/address',
    method: 'put',
    data: params
  })
}

// 新增默认地址
const addAddressApi = (params) => {
  return $axios({
    url: '/address',
    method: 'post',
    data: params
  })
}

// 删除默认地址
const removeApi = (params) => {
  return $axios({
    url: '/address',
    method: 'delete',
    data: params
  })
}

// 取消订单
const removeShopApi = (params) => {
  return $axios({
    url: '/shop',
    method: 'delete',
    data: params
  })
}

// 发货
const sendApi = (params) => {
  return $axios({
    url: '/order/send',
    method: 'put',
    data: params
  })
}

// 取消发货
const removeSendApi = (params) => {
  return $axios({
    url: '/order/send',
    method: 'delete',
    data: params
  })
}