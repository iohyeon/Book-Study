// 웹팩 환경설정 파일 -> 웹팩은 실행할때 자동으로 해당 파일을 참조함

const path = require('path');

module.exports = {
    
    mode: 'production',

    // 진입점을 설정하는 속성
    entry: './src/index.js',

    // 번들링 파일이 위치할 파일 path / 파일명 지정하는 속성
    output: {
    path: path.resolve(__dirname, 'dist'),
    filename: 'bundle.js',
    },
};