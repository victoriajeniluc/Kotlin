Rails.application.routes.draw do
 	resources :posts do 
 		resources :comments 
 	end 


 	# get '/posts' => 'posts#index', as: posts_path 
 	# get '/posts/new' => 'posts#new', as: new_post_path 
 	# post '/posts'
 	# get '/posts/:id/edit' => 'posts#edit', as: edit_post_path
 	# get '/posts/:id' => 'posts#show', as: post_path 
 	# patch '/posts/:id' => 'posts#update'
 	# delete '/posts/:id' => 'posts#destroy'

 	# get '/posts/:id/comments' => "comments#index", as: post_comments 
 	# post '/posts/:id/comments' => "comments#create"
 	# get '/posts/:id/comments/new' => "comments#new", as: new_post_comment_path
 	# get '/posts/:id/comments/:id/edit' => "comments#edit", as: edit_post_comment 
 	

 	root "posts#index"

 	get '/sessions' => 'sessions#new', as: 'login'  
  post '/sessions' => 'sessions#create'
  get '/logout' => 'sessions#destroy', as: 'logout'

  get '/signup' => 'users#new', as: 'signup'
	post '/users' => 'users#create', as: 'users'
end
