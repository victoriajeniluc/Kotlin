class Goal < ApplicationRecord
		validates :title, :body,presence: true
end
