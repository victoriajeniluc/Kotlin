class GoalsController < ApplicationController
	def index
		@goals = Goal.all.order('created_at DESC')
	end 

	def new 
		@goal = Goal.new 
	end

	def create 
		@goal = Goal.new(goal_params)
		if @goal.save 
			redirect_to @goal 
		else 
			render 'new'
		end 
	end  

	def show
		@goal = Goal.find(params[:id])
	end 

	def edit 
		@goal = Goal.find(params[:id])
	end 

	def update 
		@goal = Goal.find(params[:id])

		if @goal.update(params[:goal].permit(:title, :body, :complete))
			redirect_to @goal
		else 
			render 'edit'
		end 
	end 

	def destroy 
		@goal = Goal.find(params[:id])
		@goal.destroy 
		redirect_to goals_path
	end

	private 
	def post_params 
		params.require(:goal).permit(:title, :body, :complete)
	end 
end
