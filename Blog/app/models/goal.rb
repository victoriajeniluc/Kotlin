class Goal < ApplicationRecord
		validates :title, :body,presence: true

	def completeness
		if self.complete 
			return "complete"
		else
			return "not complete"
		end  
	end 
end
