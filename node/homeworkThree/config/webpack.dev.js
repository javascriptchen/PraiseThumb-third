const path = require('path');
const webpack = require('webpack');
const LiveReloadPlugin = require('webpack-livereload-plugin');
const ExtractTextPlugin = require("extract-text-webpack-plugin");
const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
  entry: {
    index: [
      path.join(__dirname, '../src/public/js/index.es6'),
      path.join(__dirname, '../src/public/js/indexadd.es6')
    ],
    tag: [
      path.join(__dirname, '../src/public/js/tag.es6'),
    ]
  },
  output: {
    filename: 'public/js/[name]-[hash:5].js',
    path: path.join(__dirname, '../build/')
  },
  module: {
    rules: [
      {
        test: /\.es6$/,
        exclude: /(node_modules|bower_components)/,
        use: {
          loader: 'babel-loader',
          options: {
            presets: ['env']
          }
        }
      },
      {
        test: /\.css$/,
        use: ExtractTextPlugin.extract({
          fallback: "style-loader",
          use: "css-loader"
        })
      }
    ]
  },
  plugins: [
    new webpack.DefinePlugin({
      'process.env': {
        NODE_ENV: '"dev"'
      }
    }),
    new LiveReloadPlugin({ appendScriptTag: true }), 
    new ExtractTextPlugin("public/css/[name]-[hash:5].css"),
    new webpack.optimize.CommonsChunkPlugin({
      name: 'vendor',
      filename: 'public/js/common/vendor-[hash:5].min.js',
    }),
    new HtmlWebpackPlugin({ // Also generate a test.html 
      filename: './views/layout.html',
      template: 'src/views/layout.html',
      inject: false,
    }),
    new HtmlWebpackPlugin({ // Also generate a test.html 
      filename: './views/index.html',
      template: 'src/views/index.html',
  }),
  ]
};