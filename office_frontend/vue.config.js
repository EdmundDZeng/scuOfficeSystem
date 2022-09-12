let proxyObj = {}

proxyObj['/'] = {
    //websocket
    ws: false,
    //转发到后端的请求地址
    target: 'http://localhost:8081',
    //发送请求的请求头host
    changeOrigin: true,
    //不重写后端的请求地址
    pathRewrite: {
        '^/': '/'
    }
};

proxyObj['/ws'] = {
    ws: true,
    target: 'ws://localhost:8081'
};

module.exports = {
    devServer: {
        host: 'localhost',
        port: 8080,
        proxy: proxyObj
    }
}