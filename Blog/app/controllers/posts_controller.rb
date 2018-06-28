class PostsController < ApplicationController
	def index
		@posts = Post.all.order(id: :desc)
	end 

	def new 
		@post = Post.new 

		if @post.save 
			redirect_to @post 
		else 
			render 'new'
		end 
	end

	def create 
		@post = Post.new(post_params)
		@post.save

		redirect_to @post
	end  

	def show
		@post = Post.find(params[:id])
	end 

	def edit 
		@post = Post.find_by(params[:id])
	end 

	def update 
		@post = Post.find(params[:id])

		if @post.update(params[:post].permit(:title, :body, :gratitude))
			redirect_to @post
		else 
			render 'edit'
		end 
	end 

	def destroy 
		@post = Post.find(params[:id])
		@post.destroy 
		redirect_to posts_path
	end

	private 
	def post_params 
		params.require(:post).permit(:title, :body, :gratitude)
	end 
end
