Rails.application.routes.draw do
  resources :posts
  resources :goals
  root 'posts#index'

  get '/about', to: 'pages#about'
end
