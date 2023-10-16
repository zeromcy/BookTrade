function loginApi(data) {
  return $axios({
    'url': '/user/login',
    'method': 'post',
    data
  })
}

function logoutApi(){
  return $axios({
    'url': '/user/logout',
    'method': 'post',
  })
}


function registerApi(data){
  return $axios({
    'url': '/user/register',
    'method': 'post',
    data
  })
}

// function resetApi(params){
//   return $axios({
//     'url': '/employee/reset',
//     'method': 'put',
//      data:{...params}
//   })
// }

const resetApi = (params) => {
  return $axios({
    url: '/employee/reset',
    method: 'put',
    data:params
  })
}